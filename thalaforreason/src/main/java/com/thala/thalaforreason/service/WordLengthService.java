package com.thala.thalaforreason.service;


import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class WordLengthService {


    public ThalaResponse isWordThalaforaReason(String word){

        if(!StringUtils.isBlank(word)) {
            if(word.length() ==7 ){
                String wordToDisplay = word.chars().mapToObj(Character :: toString).collect(Collectors.joining("+"));
                return  new ThalaResponse(word,"{ "+wordToDisplay+" } =7 ...so...Thala for a reason !!!!" );
            }
        }
       String  wordToDisplay = word.chars().mapToObj(Character :: toString).collect(Collectors.joining("+"));
        return new ThalaResponse(word,"{ "+wordToDisplay+" } is "+word.length()+" not equals 7 Try with another word ,Not Thala For a Reason !!!" );
    }

    public record ThalaResponse (String word, String result) {}



}
