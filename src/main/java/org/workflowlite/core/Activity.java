/********************************************************************
 * File Name:    Activity.java
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
public interface Activity<TContext extends ExecutionContext, TResult>
{
  public String getName();
  public TResult execute(TContext context);
}

