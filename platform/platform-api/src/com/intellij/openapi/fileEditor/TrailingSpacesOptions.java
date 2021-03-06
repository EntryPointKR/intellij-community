// Copyright 2000-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.intellij.openapi.fileEditor;

public interface TrailingSpacesOptions {

  boolean isStripTrailingSpaces();
  boolean isEnsureNewLineAtEOF();
  boolean isTrimBlankLinesAtEOF();
  boolean isChangedLinesOnly();
  boolean isKeepTrailingSpacesOnCaretLine();

}
