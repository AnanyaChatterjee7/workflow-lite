/********************************************************************
 * File Name:    CalculateTotalScoreAction.java
 *
 * Date Created: Sep 17, 2017
 *
 * ------------------------------------------------------------------
 * 
 * Copyright @ 2017 ajeydudhe@gmail.com
 *
 *******************************************************************/

package org.expedientframework.workflowlite.core.samples;

import java.util.Map;

import org.expedientframework.workflowlite.core.AbstractAction;
import org.expedientframework.workflowlite.core.ExecutionContext;
  
public class CalculateTotalScoreAction extends AbstractAction<ExecutionContext, Integer>
{
  public CalculateTotalScoreAction(final Map<String, Integer> scores)
  {
    this.scores = scores;
  }
  
  @Override
  public Integer execute(final ExecutionContext context)
  {
    return this.scores.values().stream().mapToInt(Integer::intValue).sum();
  }
  
  // Private
  private final Map<String, Integer> scores;
}

