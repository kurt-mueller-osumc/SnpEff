package ca.mcgill.mcb.pcingola.snpEffect.testCases;

import ca.mcgill.mcb.pcingola.snpEffect.testCases.unity.TestCasesBase;

/**
 *
 * Test case
 */
public class TestCasesZzz extends TestCasesBase {

	public TestCasesZzz() {
		super();
	}

	@Override
	protected void init() {
		super.init();
		shiftHgvs = true;
	}

	//	@Test
	//	public void test_hgvs_md() {
	//		Gpr.debug("Test");
	//		verbose = true;
	//		String genome = "testHg19Chr1";
	//		String vcf = "tests/hgvs_md.chr1.vcf";
	//		compareHgvs(genome, vcf, false);
	//	}
	//
	//	@Test
	//	public void test_hgvs_md_2() {
	//		Gpr.debug("Test");
	//		String genome = "testHg19Chr13";
	//		String vcf = "tests/hgvs_md.chr13.vcf";
	//		compareHgvs(genome, vcf);
	//	}

}
