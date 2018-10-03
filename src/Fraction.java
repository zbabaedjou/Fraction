
public class Fraction {
	private int numerateur;
	private int denominateur;
	private float value;
	private static Fraction ZERO =new Fraction(0,1);
	private static Fraction UN =new Fraction(1,1);
	
	public  Fraction(int numerateur, int denominateur) {
		this.numerateur=numerateur;
		this.denominateur=denominateur;
	}
	public Fraction(int numerateur) {
		this.numerateur=numerateur;
		this.denominateur=1;
	}
	public Fraction() {
		this.numerateur=0;
		this.denominateur=1;
	}
	
	public int get_numerateur() {
		return this.numerateur;
	}
	//affiche le dénominateur
	public int get_denominateur() {
		return this.denominateur;
	}
	
	//revoie la valeur d'une fraction
	public float get_valeur() {
		this.value=((float)this.numerateur/this.denominateur);
		return this.value;
	}
	
	//convertir la valeur de la fraction en string
	public String float_to_string() {
		return String.valueOf(this.get_valeur());
	}
	
	//addition de deux fractions
	
	public Fraction add_fraction(Fraction f1,Fraction f2) {
		f1.numerateur=f1.numerateur*f2.denominateur + f2.numerateur*f1.denominateur;
		f1.denominateur=f1.denominateur*f2.denominateur;
		return f1;
	}

	
}
