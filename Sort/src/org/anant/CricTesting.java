package org.anant;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.anant.entity.Cric;
import org.anant.entity.Info;
import org.anant.entity.Innings;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.google.gson.Gson;


public class CricTesting {
	public static void main(String[] args) {
		// Yaml yaml = new Yaml();
		test();
	}

	public static void test() {
		
		ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
		try {
			Cric cric = mapper.readValue(new File("cric.yaml"), Cric.class);
			//Info info = (Info) mapper.readValue(new File("cric.yaml"), Info.class);
			String city= cric.getInfo().getCity();
			
			String innings = cric.getInnings().toString().replace("1st innings", "innings").replace("2nd innings", "innings").replaceAll("=", ": ");//.replace("[", "").replace("]", "");
			System.out.println(innings);
			Gson g = new Gson(); 
			Iterator<Innings> inningsList = Arrays.asList(g.fromJson(innings, Innings[].class)).iterator();
			while(inningsList.hasNext()){
				Innings i = inningsList.next();
				System.out.println(i.getFirst_innings().getTeam());
			}
			Innings p = g.fromJson(innings, Innings.class);
			//System.out.println(p.getFirst_innings().getTeam());
			
			
			//Innings inn = mapper.readValue(p, Innings.class);
			//System.out.println(inn.getFirst_innings().getTeam());
			//System.out.println(ReflectionToStringBuilder.toString(cric, ToStringStyle.MULTI_LINE_STYLE));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void test1() {
		File folder = new File("all_male");
		File[] listOfFiles = folder.listFiles();
		Map<String,HashMap<String,Long>> data = new HashMap<String,HashMap<String,Long>>();
		SparkConf conf = new SparkConf().setAppName("cric").setMaster("local");
		JavaSparkContext jsc = new JavaSparkContext(conf);
/*		
		SparkContext sc= new SparkContext(conf);
		SparkSession spark = new SparkSession(sc);*/
		ArrayList<Cric> cricList = new ArrayList<Cric>();
		for (File file : listOfFiles) {
			if (file.isFile()) {
				ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
				Cric cric;
				try {
					cric = mapper.readValue(file, Cric.class);
					//String city = cric.getInfo().toString().split(",")[0].replace("{", "");
					String city= cric.getInfo().getCity();
					System.out.println("city :" +city);
					//Iterator<Object> innItr= cric.getInnings().listIterator();
					/*while(innItr.hasNext()){
						Object inn = innItr.next();
						String innings = inn.toString();
						String deliveries = innings.split("=")[3].split("=")[1];
						
						System.out.println(deliveries);
						System.out.println(innings);
					}*/
					
					System.out.println(file.getName());
					//System.out.println(ReflectionToStringBuilder.toString(cric, ToStringStyle.MULTI_LINE_STYLE));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println(file.getName());
					e.printStackTrace();
				}
			}
		}
		System.out.println("Start context");
		JavaRDD<Cric> dataRDD=jsc.parallelize(cricList);
		System.out.println(dataRDD.count());
		
	}

}
