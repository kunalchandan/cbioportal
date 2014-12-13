//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.05 at 10:50:18 AM EDT 
//


package org.mskcc.cbio.foundation.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rearrangementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rearrangementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="in-frame" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="other-gene" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pos1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pos2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="supporting-read-pairs" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="targeted-gene" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rearrangementType", propOrder = {
    "content"
})
public class RearrangementType {

    @XmlElementRef(name = "comment", type = JAXBElement.class, required = false)
    @XmlMixed
    protected List<Serializable> content;
    @XmlAttribute(name = "description")
    protected String description;
    @XmlAttribute(name = "in-frame")
    protected String inFrame;
    @XmlAttribute(name = "other-gene")
    protected String otherGene;
    @XmlAttribute(name = "pos1")
    protected String pos1;
    @XmlAttribute(name = "pos2")
    protected String pos2;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "supporting-read-pairs")
    protected Short supportingReadPairs;
    @XmlAttribute(name = "targeted-gene")
    protected String targetedGene;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the inFrame property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFrame() {
        return inFrame;
    }

    /**
     * Sets the value of the inFrame property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFrame(String value) {
        this.inFrame = value;
    }

    /**
     * Gets the value of the otherGene property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherGene() {
        return otherGene;
    }

    /**
     * Sets the value of the otherGene property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherGene(String value) {
        this.otherGene = value;
    }

    /**
     * Gets the value of the pos1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPos1() {
        return pos1;
    }

    /**
     * Sets the value of the pos1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPos1(String value) {
        this.pos1 = value;
    }

    /**
     * Gets the value of the pos2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPos2() {
        return pos2;
    }

    /**
     * Sets the value of the pos2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPos2(String value) {
        this.pos2 = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the supportingReadPairs property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSupportingReadPairs() {
        return supportingReadPairs;
    }

    /**
     * Sets the value of the supportingReadPairs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSupportingReadPairs(Short value) {
        this.supportingReadPairs = value;
    }

    /**
     * Gets the value of the targetedGene property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetedGene() {
        return targetedGene;
    }

    /**
     * Sets the value of the targetedGene property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetedGene(String value) {
        this.targetedGene = value;
    }

}