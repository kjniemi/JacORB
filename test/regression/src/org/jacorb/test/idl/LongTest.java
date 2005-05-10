package org.jacorb.test.idl;

/*
 *        JacORB  - a free Java ORB
 *
 *   Copyright (C) 1997-2001  Gerald Brose.
 *
 *   This library is free software; you can redistribute it and/or
 *   modify it under the terms of the GNU Library General Public
 *   License as published by the Free Software Foundation; either
 *   version 2 of the License, or (at your option) any later version.
 *
 *   This library is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *   Library General Public License for more details.
 *
 *   You should have received a copy of the GNU Library General Public
 *   License along with this library; if not, write to the Free
 *   Software Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 */

import junit.framework.*;
import org.jacorb.test.common.*;

/**
 * Long.java
 *
 * IDL parse tests.
 *
 */

public class LongTest extends TestCase
{
   public LongTest (String name)
   {
      super (name);
   }


   public static Test suite ()
   {
      TestSuite suite = new TestSuite ("Long Tests");
      suite.addTest (new LongTest ("testLongParseGood"));
      suite.addTest (new LongTest ("testLongParseFail1"));
      suite.addTest (new LongTest ("testLongParseFail2"));

      return suite;
   }


   /**
    */
   public void testLongParseGood ()
   {
      String file[] = new String[3];
      file[0] = "-d";
      file[1] = TestUtils.testHome() + "/src/generated";
      file[2] = TestUtils.testHome() + "/idl/compiler/succeed/Long.idl";

      assertTrue ("Compiled Long.idl", org.jacorb.idl.parser.compileAndHandle (file));
   }


   /**
    */
   public void testLongParseFail1 ()
   {
      String file[] = new String[3];
      file[0] = "-d";
      file[1] = TestUtils.testHome() + "/src/generated";
      file[2] = TestUtils.testHome() + "/idl/compiler/fail/Long_Fail1.idl";

      assertTrue ("Compiled Long_Fail1.idl", org.jacorb.idl.parser.compileAndHandle (file)==false);
   }


   /**
    */
   public void testLongParseFail2 ()
   {
      String file[] = new String[3];
      file[0] = "-d";
      file[1] = TestUtils.testHome() + "/src/generated";
      file[2] = TestUtils.testHome() + "/idl/compiler/fail/Long_Fail2.idl";

      assertTrue ("Compiled Long_Fail2.idl", org.jacorb.idl.parser.compileAndHandle (file)==false);
   }
}
