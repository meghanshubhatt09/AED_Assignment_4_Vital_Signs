/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author meghanshubhatt
 */
public class City implements Serializable{
    
    private String cityName;
    ArrayList<Community> communityList;
    HashMap<Community,String> communityMapper;
    Community community;


    public City(String cityName) {
        this.cityName = cityName;
        communityList = new ArrayList<Community>();
        communityMapper = new HashMap<Community,String>();

    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }




    public HashMap<Community, String> getCommunityMapper() {
        return communityMapper;
    }

    public void setCommunityMapper(HashMap<Community, String> communityMapper) {
        this.communityMapper = communityMapper;
    }



    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public ArrayList<Community> getCommunityList() {
        return communityList;
    }

    public void setCommunityList(ArrayList<Community> communityList) {
        this.communityList = communityList;
    }
    
    public Community AddCommunity(String CommunityName){
        community = new Community(CommunityName);
        communityMapper.put(community, cityName);
        communityList.add(community);
        return community;
    }
    

 
      
    
}
