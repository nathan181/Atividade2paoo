
public abstract class Character {
   WeaponBehavior weapon;
    
   public abstract void fight();
   
  // public abstract void descricao();
     
   
    
   
  public void setWeapon(WeaponBehavior w){
	   this.weapon = w;
   }
}
