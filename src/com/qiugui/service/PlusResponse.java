
package com.qiugui.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>plusResponse complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="plusResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="plusResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plusResponse", propOrder = {
    "plusResult"
})
public class PlusResponse {

    protected int plusResult;

    /**
     * ��ȡplusResult���Ե�ֵ��
     * 
     */
    public int getPlusResult() {
        return plusResult;
    }

    /**
     * ����plusResult���Ե�ֵ��
     * 
     */
    public void setPlusResult(int value) {
        this.plusResult = value;
    }

}
