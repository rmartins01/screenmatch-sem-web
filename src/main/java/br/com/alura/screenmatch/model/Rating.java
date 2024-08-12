package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonProperty;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
public class Rating{
    @JsonProperty("Source") 
    public String source;
    @JsonProperty("Value") 
    public String value;
}

