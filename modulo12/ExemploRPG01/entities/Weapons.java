package modulo12.ExemploRPG01.entities;

public class Weapons {

    private String weaponName;
    private Integer weaponDamage;
    private Double weaponPrice;

    public Weapons() {
    }

    public Weapons(String weaponName, Integer weaponDamage, Double weaponPrice) {
        this.weaponName = weaponName;
        this.weaponDamage = weaponDamage;
        this.weaponPrice = weaponPrice;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public Integer getWeaponDamage() {
        return weaponDamage;
    }

    public void setWeaponDamage(Integer weaponDamage) {
        this.weaponDamage = weaponDamage;
    }

    public Double getWeaponPrice() {
        return weaponPrice;
    }

    public void setWeaponPrice(Double weaponPrice) {
        this.weaponPrice = weaponPrice;
    }
    

}
