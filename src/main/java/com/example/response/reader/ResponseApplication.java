package com.example.response.reader;

import com.example.response.reader.dao.ResponsePayload;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *
 * @author kobe
 */
public class ResponseApplication {

    public static void main(String[] args) throws JsonProcessingException {
        String jsonResponse = "{\"data\":{\"id\":\"\",\"status\":\"FAILED\"},\"status\":{\"isSuccess\":false,\"message\":\"Please enter a valid Account Number\",\"errorCode\":\"ERR373\"}}";

        try {
            var response = new ObjectMapper().readValue(jsonResponse, ResponsePayload.class);
            System.out.println(new ObjectMapper().writeValueAsString(response));

            System.out.println("Data - ID: " + response.data.getId());
            System.out.println("Data - Status: " + response.data.getStatus());
            System.out.println("Is Success: " + response.status.getIsSuccess());
            System.out.println("Message: " + response.status.getMessage());
            System.out.println("Error Code: " + response.status.getErrorCode());
        } catch (JsonParseException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
