package com.example.demo.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
public class Student {
    @JsonProperty("name")
    String name;
    @JsonProperty("food")
    String food;
    @JsonProperty("money")
    float money;
    @JsonProperty("friend")
    List<String> friend;
}
