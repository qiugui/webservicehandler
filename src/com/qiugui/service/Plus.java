
package com.qiugui.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>plus complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="plus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="a" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="b" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plus", propOrder = {
    "a",
    "b"
})
public class Plus {

    protected int a;
    protected int b;

    /**
     * ��ȡa���Ե�ֵ��
     * 
     */
    public int getA() {
        return a;
    }

    /**
     * ����a���Ե�ֵ��
     * 
     */
    public void setA(int value) {
        this.a = value;
    }

    /**
     * ��ȡb���Ե�ֵ��
     * 
     */
    public int getB() {
        return b;
    }

    /**
     * ����b���Ե�ֵ��
     * 
     */
    public void setB(int value) {
        this.b = value;
    }

}
