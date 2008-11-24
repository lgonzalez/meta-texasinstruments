SECTION = "toolchains"
PRIORITY = "optional"
DESCRIPTION = "Texas Instruments codegen tools"
LICENSE = "Texas Instruments"
PR = "r0"

inherit dfetch

DIRAC_PATHFETCH = "/data/omapts/linux/dsp-tc/cgt6x-${PV}"
DIRAC_PATHCOMPONENT = "cgt6x-${PV}"
DIRAC_PATHCOMPONENTS = 4

do_stage() {
	cd ${STAGING_BINDIR}
	install -d ${STAGING_BINDIR}/dspbridge/tools/cgt6x-${PV}
	cp -a ${S}/* ${STAGING_BINDIR}/dspbridge/tools
}