/*
 * Copyright 2018 The StartupOS Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.startupos.tools.aa;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.google.common.jimfs.Configuration;
import com.google.common.jimfs.Jimfs;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import com.google.common.collect.ImmutableList;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Path;
import java.nio.file.FileSystem;
import dagger.Component;

public class DiffCommandTest {
  FileSystem fs;

  @Before
  public void setup() throws Exception {
    fs = Jimfs.newFileSystem(Configuration.unix());
    Path foo = fs.getPath("/foo");
    Files.createDirectory(foo);

    Path hello = foo.resolve("hello.txt"); // /foo/hello.txt
    Files.write(hello, ImmutableList.of("hello world"), UTF_8);      
  }

  @Test
  public void basicTest() {
  }
}
