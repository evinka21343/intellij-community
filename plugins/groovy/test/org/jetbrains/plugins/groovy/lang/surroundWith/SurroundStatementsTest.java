package org.jetbrains.plugins.groovy.lang.surroundWith;

import com.intellij.lang.surroundWith.Surrounder;
import junit.framework.Test;
import junit.framework.TestSuite;
import org.jetbrains.plugins.groovy.lang.surroundWith.descriptors.GroovyStmtsSurroundDescriptor;
import org.jetbrains.plugins.groovy.lang.surroundWith.surrounders.GroovySurrounderByClosure;
import org.jetbrains.plugins.groovy.lang.surroundWith.surrounders.surroundersImpl.blocks.open.*;
import org.jetbrains.plugins.groovy.util.PathUtil;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * User: Dmitry.Krasilschikov
 * Date: 01.06.2007
 */


public class SurroundStatementsTest extends TestSuite {
  private static Map<Class, String> surroundersOfStmtToPathsMap = new HashMap<Class, String>();

  static {
    {
      String stmtsPrefix = "statements" + File.separator;
      surroundersOfStmtToPathsMap.put(GroovyWithIfSurrounder.class, stmtsPrefix + "if");
      surroundersOfStmtToPathsMap.put(GroovyWithTryCatchFinallySurrounder.class, stmtsPrefix + "try_catch_finally");
      surroundersOfStmtToPathsMap.put(GroovyWithTryFinallySurrounder.class, stmtsPrefix + "try_finally");
      surroundersOfStmtToPathsMap.put(GroovyWithWithStatementsSurrounder.class, stmtsPrefix + "with");
      surroundersOfStmtToPathsMap.put(GroovyWithIfElseSurrounder.class, stmtsPrefix + "if_else");
      surroundersOfStmtToPathsMap.put(GroovyWithTryCatchSurrounder.class, stmtsPrefix + "try_catch");
      surroundersOfStmtToPathsMap.put(GroovyWithWhileSurrounder.class, stmtsPrefix + "while");
      surroundersOfStmtToPathsMap.put(GroovySurrounderByClosure.class, stmtsPrefix + "closure");
    }
  }

  public SurroundStatementsTest() {
    Surrounder[] surrounders = GroovyStmtsSurroundDescriptor.getStmtsSurrounders();

    String path;
    for (Surrounder surrounder : surrounders) {
      path = surroundersOfStmtToPathsMap.get(surrounder.getClass());
//      addTest(new SurroundWithTestStmts((DATA_PATH.endsWith("/") ? DATA_PATH : DATA_PATH + File.separator) + path, surrounder));
      String dataPath = PathUtil.getDataPath(SurroundStatementsTest.class);
      addTest(new SurroundWithTestItem((dataPath.endsWith("/") ? dataPath : dataPath + File.separator) + path, surrounder));
    }
  }

  public static Test suite() {
    return new SurroundStatementsTest();
  }
}
