package org.jetbrains.plugins.groovy.lang.overriding;

import com.intellij.psi.PsiMethod;
import junit.framework.Test;
import org.jetbrains.plugins.groovy.util.TestUtils;

/**
 * User: Dmitry.Krasilschikov
 * Date: 02.08.2007
 */
public class AllSuperMethodsTest extends OverridingTester {
  private static final String DATA_PATH = TestUtils.getTestDataPath() + "/overriding/allSuperMethods/";

  public AllSuperMethodsTest() {
    super(System.getProperty("path") != null ?
        System.getProperty("path") :
        DATA_PATH
    );
  }
  public static Test suite() {
    return new AllSuperMethodsTest();
  }

  PsiMethod[] findMethod(PsiMethod method) {
    return method.findSuperMethods();
  }
}
