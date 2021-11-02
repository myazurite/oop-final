package medicine.Constant;

import medicine.entity.*;

public class MiniCache {
    private static final Cache ITEM = new Cache();
    private static final Role ROLE = new Role();
    private static final GSL GSL = new GSL();
    private static final P P = new P();
    private static final POM POM = new POM();
    
    public static void initRole(String role){
        ROLE.setRole(role);
    }
    
    public static String getRole(){
        if(ROLE.getRole() == null || ROLE.getRole().equals("")){
            System.out.println("cache role null!");
            return null;
        }else{
            return ROLE.getRole();
        }
    }
    
    public static void initGSL(GSL gsl){
        GSL.setName(gsl.getName());
        GSL.setCategory(gsl.getCategory());
        GSL.setComponent(gsl.getComponent());
        GSL.setUsage(gsl.getUsage());
    }
    
    public static Object getGSL() {
        if (GSL == null) {
            System.out.println("cache gsl null!");
            return new Object();
        } else {
            return GSL;
        }
    }
    
    public static void initP(P p){
        P.setName(p.getName());
        P.setCategory(p.getCategory());
        P.setComponent(p.getComponent());
        P.setUsage(p.getUsage());
    }
    
    public static Object getP() {
        if (P == null) {
            System.out.println("cache P null!");
            return new Object();
        } else {
            return P;
        }
    }
    
    public static void initPOM(POM pom){
        POM.setName(pom.getName());
        POM.setCategory(pom.getCategory());
        POM.setComponent(pom.getComponent());
        POM.setUsage(pom.getUsage());
    }
    
    public static Object getPOM() {
        if (POM == null) {
            System.out.println("cache pom null!");
            return new Object();
        } else {
            return POM;
        }
    }
    
    
    public static void initCache(Integer select) {
        ITEM.setSelect(select);
    }

    public static Integer getSelect() {
        if (ITEM.getSelect() == null) {
            System.out.println("cache null!");
            return null;
        } else {
            return ITEM.getSelect();
        }
    }
    
}


// class này để khi chạy chương trình thì mặc định chạy vào menu
class Role {
    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    
}


// Class này để lưu lựa chọn category vì khi chuyên form sẽ không chuyển dc data nên 
// phải lưu vào một phiên này
class Cache{
        private Integer select;

        public Integer getSelect() {
            return select;
        }

        public void setSelect(Integer select) {
            this.select = select;
        }
        
        
    }

