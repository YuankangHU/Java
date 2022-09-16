package com.kang;

import java.io.*;
import java.util.ArrayList;

public class TP_Houzehou {
    public static void main(String[] args) {
        Personne p1 = new Personne("Backus","John","GML","1957");
        p1.fileoutput();
        Personne p2 = new Personne("Cox","Brad","Java","1983");
        p2.fileoutput();
//        p1.instance();
//        System.out.println(p1.toString());

        Whoswho whoswho = new Whoswho();
        whoswho.lire("test.ext");
    }
}

class Personne{
    private String nom;
    private String prenom;
    private String langage;
    private String annee;

    private static int compteur = 1;

    public Personne(String nom, String prenom, String langage, String annee) {
        this.nom = nom;
        this.prenom = prenom;
        this.langage = langage;
        this.annee = annee;
    }

    public Personne() {
        System.out.println("第 " + compteur + " 个");
        compteur++;
    }
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLangage() {
        return langage;
    }

    public void setLangage(String langage) {
        this.langage = langage;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public void instance(){
        System.out.println("有 "+ (compteur-1) + " 个实例");
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append(nom);
        builder.append(":");
        builder.append(prenom);
        builder.append(":");
        builder.append(langage);
        builder.append(":");
        builder.append(annee);
        builder.append(":");
        return builder.toString();
        //return nom + ":" + prenom +  ":" + langage + ":" + annee;
    }

    public void fileoutput(){
        File file = new File("test.ext");
        //设置为true保证不覆盖原来的
        try(FileOutputStream fos = new FileOutputStream(file,true); PrintStream ps = new PrintStream(fos);){
            ps.println(this.toString());
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}

class Whoswho{
    Personne personnes;

    public Whoswho() {
    }

    //创建链表储存的目的是什么，不理解
    public Whoswho(Personne personnes) {
        this.personnes = personnes;
        ArrayList<Personne> ps = new ArrayList<Personne>();
        ps.add(personnes);
    }


    public void lire(String pathname){
        try(FileReader fr = new FileReader(pathname); BufferedReader br = new BufferedReader(fr)){
            String lecture;
            while((lecture = br.readLine()) != null){
                System.out.println(lecture);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

