package com.froma.sp.baito.appl;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.froma.sp.AbstractTest;
import com.froma.sp.FanSpRemoteWebDriverFactory;
import com.froma.sp.baito.JobDetailPage;


public class ApplyTest extends AbstractTest{

    @Before
    public void setUp() throws Exception {
        driver = FanSpRemoteWebDriverFactory.create();
        this.baseUrl = "http://froma.com/";
    }

    @Test
    public void 正常_応募入力_完了() throws Exception {
        driver.manage().deleteAllCookies();
        
        JobDetailPage detailPage = getJobDetailPageByRqmtId("RQ37143337_ED1/");
        ApplyInputPage applyInput = detailPage.goToApplyPageWithApplyUpper();
        ApplyConfirmPage applyConfirm = applyInput.typeFurigana("").typeKanjiSimei("").typePhone("").selectBrthDay("").submitApply();
        ApplyDonePage applyDone = applyConfirm.confirmApplyUpper();
        assertTrue(applyDone.lblApplyDone.getText().contains("This is an awesome comment"));
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
