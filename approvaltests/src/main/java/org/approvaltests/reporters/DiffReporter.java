package org.approvaltests.reporters;

import org.approvaltests.reporters.linux.LinuxDiffReporter;
import org.approvaltests.reporters.macosx.MacDiffReporter;
import org.approvaltests.reporters.windows.WindowsDiffReporter;

public class DiffReporter extends FirstWorkingReporter
{
  public static final DiffReporter INSTANCE = new DiffReporter();
  public DiffReporter()
  {
    super(
        WindowsDiffReporter.INSTANCE,
        MacDiffReporter.INSTANCE,
        LinuxDiffReporter.INSTANCE,
        JunitReporter.INSTANCE,
        QuietReporter.INSTANCE);
  }
}
