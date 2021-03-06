//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.20 at 12:02:48 PM CDT 
//


package com.concretepage.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for student complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="student">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tenure" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="dob" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="male" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="anualSalary" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "student", propOrder = {
    "amount",
    "tenure",
    "dob",
    "male",
    "anualSalary"
})
public class Student {

    protected int amount;
    protected boolean tenure;
    @XmlElement(required = true)
    protected String dob;
    protected boolean male;
    protected int anualSalary;

    /**
     * Gets the value of the amount property.
     * 
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(int value) {
        this.amount = value;
    }

    /**
     * Gets the value of the tenure property.
     * 
     */
    public boolean isTenure() {
        return tenure;
    }

    /**
     * Sets the value of the tenure property.
     * 
     */
    public void setTenure(boolean value) {
        this.tenure = value;
    }

    /**
     * Gets the value of the dob property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDob() {
        return dob;
    }

    /**
     * Sets the value of the dob property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDob(String value) {
        this.dob = value;
    }

    /**
     * Gets the value of the male property.
     * 
     */
    public boolean isMale() {
        return male;
    }

    /**
     * Sets the value of the male property.
     * 
     */
    public void setMale(boolean value) {
        this.male = value;
    }

    /**
     * Gets the value of the anualSalary property.
     * 
     */
    public int getAnualSalary() {
        return anualSalary;
    }

    /**
     * Sets the value of the anualSalary property.
     * 
     */
    public void setAnualSalary(int value) {
        this.anualSalary = value;
    }

}
