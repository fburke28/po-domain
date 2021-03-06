//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.31 at 11:06:40 PM EDT 
//


package com.po.domain;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}title"/>
 *         &lt;element ref="{}description"/>
 *         &lt;element ref="{}guid"/>
 *         &lt;element ref="{}pubDate"/>
 *         &lt;element ref="{http://www.onthesnow.com/ots_rss_namespace/}open_staus"/>
 *         &lt;element ref="{http://www.onthesnow.com/ots_rss_namespace/}resort_id"/>
 *         &lt;element ref="{http://www.onthesnow.com/ots_rss_namespace/}base_depth"/>
 *         &lt;element ref="{http://www.onthesnow.com/ots_rss_namespace/}snowfall_48hr"/>
 *         &lt;element ref="{http://www.onthesnow.com/ots_rss_namespace/}region_name"/>
 *         &lt;element ref="{http://www.onthesnow.com/ots_rss_namespace/}surface_condition"/>
 *         &lt;element ref="{http://www.onthesnow.com/ots_rss_namespace/}base_depth_metric"/>
 *         &lt;element ref="{http://www.onthesnow.com/ots_rss_namespace/}snowfall_48hr_metric"/>
 *         &lt;element ref="{http://www.onthesnow.com/ots_rss_namespace/}resort_rss_link"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "title",
    "description",
    "guid",
    "pubDate",
    "openStaus",
    "resortId",
    "baseDepth",
    "snowfall48Hr",
    "regionName",
    "surfaceCondition",
    "baseDepthMetric",
    "snowfall48HrMetric",
    "resortRssLink"
})
@XmlRootElement(name = "item")
public class Item {

    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected Guid guid;
    @XmlElement(required = true)
    protected String pubDate;
    @XmlElement(name = "open_staus", namespace = "http://www.onthesnow.com/ots_rss_namespace/", required = true)
    protected String openStaus;
    @XmlElement(name = "resort_id", namespace = "http://www.onthesnow.com/ots_rss_namespace/", required = true)
    protected BigInteger resortId;
    @XmlElement(name = "base_depth", namespace = "http://www.onthesnow.com/ots_rss_namespace/", required = true)
    protected BigInteger baseDepth;
    @XmlElement(name = "snowfall_48hr", namespace = "http://www.onthesnow.com/ots_rss_namespace/", required = true)
    protected BigInteger snowfall48Hr;
    @XmlElement(name = "region_name", namespace = "http://www.onthesnow.com/ots_rss_namespace/", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String regionName;
    @XmlElement(name = "surface_condition", namespace = "http://www.onthesnow.com/ots_rss_namespace/", required = true)
    protected String surfaceCondition;
    @XmlElement(name = "base_depth_metric", namespace = "http://www.onthesnow.com/ots_rss_namespace/", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String baseDepthMetric;
    @XmlElement(name = "snowfall_48hr_metric", namespace = "http://www.onthesnow.com/ots_rss_namespace/", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String snowfall48HrMetric;
    @XmlElement(name = "resort_rss_link", namespace = "http://www.onthesnow.com/ots_rss_namespace/", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String resortRssLink;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
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
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link Guid }
     *     
     */
    public Guid getGuid() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Guid }
     *     
     */
    public void setGuid(Guid value) {
        this.guid = value;
    }

    /**
     * Gets the value of the pubDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPubDate() {
        return pubDate;
    }

    /**
     * Sets the value of the pubDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPubDate(String value) {
        this.pubDate = value;
    }

    /**
     * Gets the value of the openStaus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenStaus() {
        return openStaus;
    }

    /**
     * Sets the value of the openStaus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenStaus(String value) {
        this.openStaus = value;
    }

    /**
     * Gets the value of the resortId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getResortId() {
        return resortId;
    }

    /**
     * Sets the value of the resortId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setResortId(BigInteger value) {
        this.resortId = value;
    }

    /**
     * Gets the value of the baseDepth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBaseDepth() {
        return baseDepth;
    }

    /**
     * Sets the value of the baseDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBaseDepth(BigInteger value) {
        this.baseDepth = value;
    }

    /**
     * Gets the value of the snowfall48Hr property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSnowfall48Hr() {
        return snowfall48Hr;
    }

    /**
     * Sets the value of the snowfall48Hr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSnowfall48Hr(BigInteger value) {
        this.snowfall48Hr = value;
    }

    /**
     * Gets the value of the regionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     * Sets the value of the regionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionName(String value) {
        this.regionName = value;
    }

    /**
     * Gets the value of the surfaceCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurfaceCondition() {
        return surfaceCondition;
    }

    /**
     * Sets the value of the surfaceCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurfaceCondition(String value) {
        this.surfaceCondition = value;
    }

    /**
     * Gets the value of the baseDepthMetric property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseDepthMetric() {
        return baseDepthMetric;
    }

    /**
     * Sets the value of the baseDepthMetric property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseDepthMetric(String value) {
        this.baseDepthMetric = value;
    }

    /**
     * Gets the value of the snowfall48HrMetric property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnowfall48HrMetric() {
        return snowfall48HrMetric;
    }

    /**
     * Sets the value of the snowfall48HrMetric property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnowfall48HrMetric(String value) {
        this.snowfall48HrMetric = value;
    }

    /**
     * Gets the value of the resortRssLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResortRssLink() {
        return resortRssLink;
    }

    /**
     * Sets the value of the resortRssLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResortRssLink(String value) {
        this.resortRssLink = value;
    }

}
