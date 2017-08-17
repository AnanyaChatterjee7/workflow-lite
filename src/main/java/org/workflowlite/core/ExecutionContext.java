/********************************************************************
 * File Name:    ExecutionContext.java
 *
 * Date Created: Aug 5, 2017
 *
 * ------------------------------------------------------------------
 * 
 * Copyright @ 2017 ajeydudhe@gmail.com
 *
 *******************************************************************/

package org.workflowlite.core;
  
/**
 * TODO: Update with a detailed description of the interface/class.
 *
 */
public interface ExecutionContext
{
  public String getWorkflowId();
  public <T> T getValue(final String property);
  public <T> void setValue(final String property, final T value);
}

