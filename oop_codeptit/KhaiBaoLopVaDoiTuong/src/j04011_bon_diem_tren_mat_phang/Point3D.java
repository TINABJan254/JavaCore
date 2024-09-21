package j04011_bon_diem_tren_mat_phang;

public class Point3D {
    private int x, y, z;
    
    public Point3D(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public static boolean check(Point3D a, Point3D b, Point3D c, Point3D d){
        int[] ab = new int[3]; //vector ab
        int[] ac = new int[3]; //vector ac
        int[] ad = new int[3]; //vector ad
        
        ab[0] = b.x - a.x;
        ab[1] = b.y - a.y;
        ab[2] = b.z - a.z;
        
        ac[0] = c.x - a.x;
        ac[1] = c.y - a.y;
        ac[2] = c.z - a.z;
        
        ad[0] = d.x - a.x;
        ad[1] = d.y - a.y;
        ad[2] = d.z - a.z;
        
        int[] N = new int[3]; //vector phap tuyen = tich co huong ab vs ac
        N[0] = ab[1] * ac[2] - ab[2] * ac[1]; // N_x
        N[1] = ab[2] * ac[0] - ab[0] * ac[2]; // N_y
        N[2] = ab[0] * ac[1] - ab[1] * ac[0]; // N_z
        
        //tich vo huong N vs ad
        int dotProduct = N[0] * ad[0] + N[1] * ad[1] + N[2] * ad[2]; 
        
        if (dotProduct == 0){
            return true;
        }
        return false;
    }
    
}
