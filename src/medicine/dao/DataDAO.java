package medicine.dao;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import medicine.entity.GSL;
import medicine.entity.P;
import medicine.entity.POM;

public class DataDAO {
    public static List<GSL> getAllGSL(){
        List<GSL> gsls = new ArrayList<>();
        GSL gsl = null;
        FileInputStream fileInputStream = null;
        BufferedReader bufferedReader = null;
        String line = null;
        
        try {
            fileInputStream = new FileInputStream("GSL.txt");
            bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            line = null;
            while((line = bufferedReader.readLine()) != null){
               gsl = new GSL();
               gsl.setName(line);      
               line = bufferedReader.readLine();
               gsl.setCategory(line);
               line = bufferedReader.readLine();
               gsl.setComponent(line);
               line = bufferedReader.readLine();
               gsl.setUsage(line);   
               gsls.add(gsl);
            }
        } catch (Exception e) {
        }
        
        return gsls;
    }
    
    public static List<P> getAllP(){
        List<P> ps = new ArrayList<>();
        P p = null;
        FileInputStream fileInputStream = null;
        BufferedReader bufferedReader = null;
        String line = null;
        
        try {
            fileInputStream = new FileInputStream("P.txt");
            bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            line = null;
            while((line = bufferedReader.readLine()) != null){
               p = new P();
               p.setName(line);      
               line = bufferedReader.readLine();
               p.setCategory(line);
               line = bufferedReader.readLine();
               p.setComponent(line);
               line = bufferedReader.readLine();
               p.setUsage(line);   
               ps.add(p);
            }
        } catch (Exception e) {
        }
        
        return ps;
    }
    
    public static List<POM> getAllPOM(){
        List<POM> poms = new ArrayList<>();
        POM pom = null;
        FileInputStream fileInputStream = null;
        BufferedReader bufferedReader = null;
        String line = null;
        
        try {
            fileInputStream = new FileInputStream("POM.txt");
            bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            line = null;
            while((line = bufferedReader.readLine()) != null){
               pom = new POM();
               pom.setName(line);      
               line = bufferedReader.readLine();
               pom.setCategory(line);
               line = bufferedReader.readLine();
               pom.setComponent(line);
               line = bufferedReader.readLine();
               pom.setUsage(line);   
               poms.add(pom);
            }
        } catch (Exception e) {
        }
        
        return poms;
    }
}
