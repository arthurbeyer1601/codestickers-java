package com.github.codestickers;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * A container for annotation repetition.
 */
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE,
		ElementType.FIELD,
		ElementType.METHOD,
		ElementType.PARAMETER,
		ElementType.CONSTRUCTOR,
		ElementType.LOCAL_VARIABLE,
		ElementType.ANNOTATION_TYPE,
		ElementType.PACKAGE,
		ElementType.TYPE_PARAMETER,
		ElementType.TYPE_USE})
@Documented
public @interface Hints
{
	Hint[] value();
}
