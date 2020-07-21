package main;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class Main {
    public static void main(String[] args){
        MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
        MongoDatabase database = mongoClient.getDatabase("compras");
        MongoCollection<Document> collection = database.getCollection("Ordenes");
        long countDocuments = collection.countDocuments();
        System.out.println(countDocuments);
    }

}
