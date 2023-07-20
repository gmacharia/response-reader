package com.example.response.reader.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kobe
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponsePayload {
    public DataDao data;
    public StatusDao status;
    
}
