package Method_Overridding;

	class Electricity {
	     double units;

	    public Electricity(double units) {
	        this.units = units;
	    }
	    public double calculateBill() {
	        return units * 1.0; 
	    }
	}

	
	class ResidentialBill extends Electricity {
	    public ResidentialBill(double units) {
	       super(units);
	    }
	    @Override
	    public double calculateBill() {
	        double rate = 1.5; 
	        return units * rate;
	    }
	}

	
	class IndustrialBill extends Electricity {
	    public IndustrialBill(double units) {
	        super(units);
	    }

	    @Override
	    public double calculateBill() {
	        double rate = 2.0; 
	        return units * rate;
	    }
	}

	
	class CommercialBill extends Electricity {
	    public CommercialBill(double units) {
	        super(units);
	    }

	    @Override
	    public double calculateBill() {
	        double rate = 2.5; 
	        return units * rate;
	    }
	}

	
	public class TestElectricityBill {
	    public static void main(String[] args) {
	        
	        ResidentialBill rs = new ResidentialBill(150); 
	        System.out.println("ResidentialBill "+rs.calculateBill());

	       
	        IndustrialBill ib = new IndustrialBill(300); 
	        System.out.println("IndustrialBill "+ib.calculateBill());

	        
	        CommercialBill cb = new CommercialBill(500); 
	        System.out.println("CommercialBill "+cb.calculateBill());
	    }
	}
