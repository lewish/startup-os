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

package com.google.startupos.common;

import dagger.Module;
import dagger.Provides;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import javax.inject.Singleton;

@Module
public class CommonModule {
  public @Provides @Singleton FileSystem provideDefaultFileSystem() {
    return FileSystems.getDefault();
  }
  public @Provides @Singleton String provideUserHome() {
    return System.getProperty("user.home");
  }
}
