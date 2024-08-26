package com.example.cloudstash.service;

import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Service;

import com.example.cloudstash.model.User;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;

@Service
public class AuthService {

  private static final String COLLECTION_NAME = "users";

  public String registerUser(User u) {
    Firestore dbFirestore = FirestoreClient.getFirestore();

    ApiFuture<WriteResult> collectionAPIFuture = dbFirestore.collection(COLLECTION_NAME).document(u.getFirstName())
        .set(u);

    try {
      return collectionAPIFuture.get().getUpdateTime().toString();
    } catch (InterruptedException e) {
      return "ERROR";
    } catch (ExecutionException e) {
      return "ERROR";
    }
  }
}
