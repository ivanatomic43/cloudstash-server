package com.example.cloudstash.firebase;

import java.io.FileInputStream;
import java.io.IOException;

import org.springframework.stereotype.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

import jakarta.annotation.PostConstruct;

@Service
public class FirebaseInitializer {

      Logger logger = LoggerFactory.getLogger(FirebaseInitializer.class);

      @PostConstruct
      public void initialization() {
            logger.info("INITIALIZATION OF FIREBASE");
            FileInputStream serviceAccount;
            try {
                  serviceAccount = new FileInputStream("./serviceAccountKey.json");

                  FirebaseOptions options = new FirebaseOptions.Builder()
                              .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                              .setDatabaseUrl(
                                          "https://cloudstash-a9ca9-default-rtdb.europe-west1.firebasedatabase.app/")
                              .build();

                  FirebaseApp.initializeApp(options);

                  logger.info("Firebase application has been initialized");
            } catch (IOException e) {
                  logger.error(e.getMessage());
            }
      }
}
