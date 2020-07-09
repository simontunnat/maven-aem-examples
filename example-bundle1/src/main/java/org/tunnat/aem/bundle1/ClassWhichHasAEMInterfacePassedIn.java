package org.tunnat.aem.bundle1;

import com.day.cq.wcm.api.Page;
import org.apache.commons.lang3.StringUtils;

public class ClassWhichHasAEMInterfacePassedIn {

  public String getTrimmedTitle(final Page page, int length) {
    String title = page.getTitle();
    return StringUtils.left(title, length);
  }
}
