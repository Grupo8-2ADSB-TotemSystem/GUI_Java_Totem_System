///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.mycompany.totem_system;
//import org.springframework.jdbc.core.JdbcTemplate;
//import java.util.concurrent.TimeUnit;
//import org.springframework.dao.DataAccessException;
///**
// *
// * @author Vinícius
// */
//public class testebagunca {
//    public static void main(String[] args) {
//        Looca looca = new Looca();
//        Connection connection = new Connection();
//        JdbcTemplate con = connection.getConnection();
//        ConnectionSQL connectionSQL = new ConnectionSQL();
//        JdbcTemplate conSQL = connectionSQL.getConnection();
//
//        long memoriaUso = looca.getMemoria().getEmUso();
//        Double memoriaUsoInsert = Double.parseDouble(Conversor.formatarBytes(memoriaUso.replace("GiB", "".replace(",", "."))));
//        long memoriaDisponivel = looca.getMemoria().getDisponivel();
//        Double memoriaDisponivelinsert = Double.parseDouble(Conversor.formatarBytes(memoriaDisponivel.replace("GiB", "".replace(",", "."))));
//        Double processadorUso = looca.getProcessador().getUso();
//        Double processadorUsoInsert = Double.parseDouble(String.format("%.2f", processadorUso) + "%");
//        Double temperatura = looca.getTemperatura().getTemperatura();
//        
//        System.out.println(memoriaDisponivelInsert);
//        System.out.println(memo);
//    }
//}
