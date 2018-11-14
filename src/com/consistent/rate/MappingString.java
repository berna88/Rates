package com.consistent.rate;

import com.liferay.portal.kernel.util.PwdGenerator;

public class MappingString {

	
	public String getDynamicContent(String es, String en){
		String id_es="es_ES";
		String id_en="en_US";
		String dynamic="<dynamic-content language-id=\""+id_es+"\"><![CDATA["+es+"]]></dynamic-content>"
		+"<dynamic-content language-id=\""+id_en+"\"><![CDATA["+en+"]]></dynamic-content>";
		return dynamic;
	}
	
	public String getDynamicContentString(String es, String en){
		String id_es="es_ES";
		String id_en="en_US";
		String dynamic="<dynamic-content language-id=\""+id_es+"\"><![CDATA[[\""+es+"\"]]]></dynamic-content>"
		+"<dynamic-content language-id=\""+id_en+"\"><![CDATA[[\""+en+"\"]]]></dynamic-content>";
		return dynamic;
	}
	
	public String DynamicElement(String name,String type,String index,String dynamic){
		String dynamicElement=null;
		
		if(!dynamic.equals(null)){
			dynamicElement="<dynamic-element name=\""+name+"\"  instance-id=\""+generateInstanceId()+"\" type=\""+type+"\" index-type=\""+index+"\">"+dynamic+
					  "</dynamic-element>";
		}
		
		return dynamicElement;
	}

	public String DynamicElementTwoWays(String name,String type,String index,String dynamic,String item){
		String dynamicElement=null;
		
		if(!dynamic.equals(null)){
			dynamicElement="<dynamic-element name=\""+name+"\"  instance-id=\""+generateInstanceId()+"\" type=\""+type+"\" index-type=\""+index+"\">"+dynamic+item+
					  "</dynamic-element>";
		}
		
		return dynamicElement;
	}
	
	public String DynamicHeader(String content){
		String number="1.0";
		String lang_deafult="es_ES,en_US";
		String lang_deafult_es="es_ES";
		String lang="es_ES";
		String contents = null;
		if(!content.equals(null)){
			 contents ="<?xml version=\""+number+"\"?><root available-locales=\""+lang_deafult+"\" default-locale=\""+lang+"\">"+content+"</root>";

		}
		
		return contents;
	}
	public String generateInstanceId() {
		   StringBuilder instanceId = new StringBuilder(8);

		   String key = PwdGenerator.KEY1 + PwdGenerator.KEY2 + PwdGenerator.KEY3;
		       
		   for (int i = 0; i < 8; i++) {
		       int pos = (int)Math.floor(Math.random() * key.length());

		       instanceId.append(key.charAt(pos));
		   }
		   return instanceId.toString();
		}
}
