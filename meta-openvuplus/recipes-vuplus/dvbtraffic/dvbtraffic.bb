DESCRIPTION = "dvbtraffic is a tool to display all pids on a transport stream"
SECTION = "console/multimedia"
PRIORITY = "optional"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
PV = "0.0+cvs${SRCDATE}"

SRC_URI = "cvs://anonymous@cvs.linuxtv.org/cvs/linuxtv;module=dvb-apps/util/dvbtraffic"

S = "${WORKDIR}/dvbtraffic"
CFLAGS_append = " ${LDFLAGS} -D PATH_MAX=128"

do_compile() {
	oe_runmake dvbtraffic
}

do_install() {
	install -d ${D}${bindir}
	install -m 0755 dvbtraffic ${D}${bindir}/
}
