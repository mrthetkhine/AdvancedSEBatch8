package com.turing.advancedse8.designpattern.anno;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Validator {
	void validate(Object obj)
	{
		Class clazz = obj.getClass();
		Field []fields = clazz.getDeclaredFields();
		
		for(Field field : fields)
		{
			//System.out.println("Field "+field);
			Annotation[] anns = field.getDeclaredAnnotationsByType(NotNullOrEmpty.class);
			for(Annotation ann:anns )
			{
				//System.out.println("Anno "+ann);
				try {
					String value = (String) (field.get(obj));
					if(value == null || value =="")
					{
						NotNullOrEmpty an = (NotNullOrEmpty)ann;
						System.out.println("Field "+ field.getName()+" "+ an.message());
					}
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
