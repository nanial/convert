package com.converter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;


public class ParsCurrency {

    public static Map<String, Double> currencyMap = new HashMap<>();
    private static ArrayList<String> currencyPrintTable = new ArrayList<>();

    public static String loadCross() {
        List<String> nameOfCurrency = new ArrayList<>();
        List<Double> valueOfCurrency = new ArrayList<>();
        try {

            Date date = new Date();

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yy");

            Document document = Jsoup.connect("https://finance.tut.by/crosskurs/").get();
            Elements elements = document.getElementsByClass("b-course");
            String s = elements.select("p").text();
            String[] currency = s.split(" ");

            for (int i = 0; i < currency.length; i++) {
                i++;
                valueOfCurrency.add(Double.parseDouble(currency[i]));
                i++;
            }

            Elements elements1 = document.getElementsByClass("first");
            var ar = elements1.select("a");
            for (var a : ar) {
                nameOfCurrency.add(a.text());
            }

            for (int i = 0; i < nameOfCurrency.size(); i++) {
                currencyMap.put(nameOfCurrency.get(i), valueOfCurrency.get(i));
            }

            currencyPrintTable.add(" " + simpleDateFormat.format(date));

        } catch (IOException ie) {
            System.out.println(ie.getMessage());
        }
        return currencyPrintTable.toString();
    }

    public static String getDolEu(double amount) {

        return "" + (Double) currencyMap.get("Доллар США → Евро") * amount;//
    }

    public static String getDolRUR(double amount) {
        return "" + (Double) currencyMap.get("Доллар США → Российский рубль") * amount;
    }

    public static String getDolUAH(double amount) {

        return "" + (Double) currencyMap.get("Доллар США → Украинская гривна") * amount;
    }

    public static String getEuRUR(double amount) {
        return "" + (Double) currencyMap.get("Евро → Российский рубль") * amount;
    }

    public static String getGBPDol(double amount){
        return "" + (Double) currencyMap.get("Польский злотый → Доллар США") * amount;
    }

    public static String getEuDol(double amount) {

        return "" + (Double) currencyMap.get("Евро → Доллар США") * amount;
    }

    public static String getRURDol(double amount) {
        return "" + (Double) currencyMap.get("Российский рубль → Доллар США") * amount;
    }

    public static String getRUREu(double amount) {
        return "" + (Double) currencyMap.get("Российский рубль → Евро") * amount;
    }

    public static String getUAHDol(double amount) {
        return "" + (Double) currencyMap.get("Украинская гривна → Доллар США") * amount;
    }
}
