# Auto-Generated by cargo-bitbake 0.3.16
#
inherit cargo

# If this is git based prefer versioned ones if they exist
# DEFAULT_PREFERENCE = "-1"

# how to get mecha-edge-bluetooth could be as easy as but default to a git checkout:
# SRC_URI += "crate://crates.io/mecha-edge-bluetooth/0.1.0"
SRC_URI += "git://github.com/Dhruvesh08/mecha-edge-bluetooth.git;protocol=https;nobranch=1;branch=bluer"
SRCREV = "a49bacfbf8a56df81f7787bd0e039a02646bc829"
S = "${WORKDIR}/git"
CARGO_SRC_DIR = ""
PV:append = ".AUTOINC+a49bacfbf8"

# please note if you have entries that do not begin with crate://
# you must change them to how that package can be fetched
SRC_URI += " \
    crate://crates.io/addr2line/0.21.0 \
    crate://crates.io/adler/1.0.2 \
    crate://crates.io/aho-corasick/1.0.4 \
    crate://crates.io/async-trait/0.1.73 \
    crate://crates.io/autocfg/1.1.0 \
    crate://crates.io/backtrace/0.3.69 \
    crate://crates.io/bitflags/1.3.2 \
    crate://crates.io/bitflags/2.4.0 \
    crate://crates.io/block/0.1.6 \
    crate://crates.io/bluer/0.16.0 \
    crate://crates.io/bluez-async/0.7.2 \
    crate://crates.io/bluez-generated/0.3.0 \
    crate://crates.io/btleplug/0.11.0 \
    crate://crates.io/bytes/1.4.0 \
    crate://crates.io/cc/1.0.83 \
    crate://crates.io/cesu8/1.1.0 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/cocoa-foundation/0.1.1 \
    crate://crates.io/cocoa/0.25.0 \
    crate://crates.io/combine/4.6.6 \
    crate://crates.io/core-foundation-sys/0.8.4 \
    crate://crates.io/core-foundation/0.9.3 \
    crate://crates.io/core-graphics-types/0.1.2 \
    crate://crates.io/core-graphics/0.23.1 \
    crate://crates.io/dashmap/5.5.1 \
    crate://crates.io/dbus-tokio/0.7.6 \
    crate://crates.io/dbus/0.9.7 \
    crate://crates.io/either/1.9.0 \
    crate://crates.io/env_logger/0.10.0 \
    crate://crates.io/errno-dragonfly/0.1.2 \
    crate://crates.io/errno/0.3.2 \
    crate://crates.io/foreign-types-macros/0.2.3 \
    crate://crates.io/foreign-types-shared/0.1.1 \
    crate://crates.io/foreign-types-shared/0.3.1 \
    crate://crates.io/foreign-types/0.3.2 \
    crate://crates.io/foreign-types/0.5.0 \
    crate://crates.io/futures-channel/0.3.28 \
    crate://crates.io/futures-core/0.3.28 \
    crate://crates.io/futures-executor/0.3.28 \
    crate://crates.io/futures-io/0.3.28 \
    crate://crates.io/futures-macro/0.3.28 \
    crate://crates.io/futures-sink/0.3.28 \
    crate://crates.io/futures-task/0.3.28 \
    crate://crates.io/futures-util/0.3.28 \
    crate://crates.io/futures/0.3.28 \
    crate://crates.io/getrandom/0.2.10 \
    crate://crates.io/gimli/0.28.0 \
    crate://crates.io/hashbrown/0.14.0 \
    crate://crates.io/heck/0.4.1 \
    crate://crates.io/hermit-abi/0.3.2 \
    crate://crates.io/hex/0.4.3 \
    crate://crates.io/humantime/2.1.0 \
    crate://crates.io/is-terminal/0.4.9 \
    crate://crates.io/itertools/0.10.5 \
    crate://crates.io/itoa/1.0.9 \
    crate://crates.io/jni-sys/0.3.0 \
    crate://crates.io/jni-utils/0.1.1 \
    crate://crates.io/jni/0.19.0 \
    crate://crates.io/libc/0.2.147 \
    crate://crates.io/libdbus-sys/0.2.5 \
    crate://crates.io/linux-raw-sys/0.4.5 \
    crate://crates.io/lock_api/0.4.10 \
    crate://crates.io/log/0.4.20 \
    crate://crates.io/macaddr/1.0.1 \
    crate://crates.io/malloc_buf/0.0.6 \
    crate://crates.io/memchr/2.5.0 \
    crate://crates.io/miniz_oxide/0.7.1 \
    crate://crates.io/mio/0.8.8 \
    crate://crates.io/nix/0.26.2 \
    crate://crates.io/num-derive/0.4.0 \
    crate://crates.io/num-traits/0.2.16 \
    crate://crates.io/num_cpus/1.16.0 \
    crate://crates.io/objc/0.2.7 \
    crate://crates.io/object/0.32.0 \
    crate://crates.io/once_cell/1.18.0 \
    crate://crates.io/parking_lot/0.12.1 \
    crate://crates.io/parking_lot_core/0.9.8 \
    crate://crates.io/pin-project-lite/0.2.12 \
    crate://crates.io/pin-utils/0.1.0 \
    crate://crates.io/pkg-config/0.3.27 \
    crate://crates.io/pretty_env_logger/0.5.0 \
    crate://crates.io/proc-macro2/1.0.66 \
    crate://crates.io/quote/1.0.33 \
    crate://crates.io/redox_syscall/0.3.5 \
    crate://crates.io/regex-automata/0.3.6 \
    crate://crates.io/regex-syntax/0.7.4 \
    crate://crates.io/regex/1.9.3 \
    crate://crates.io/rustc-demangle/0.1.23 \
    crate://crates.io/rustix/0.38.8 \
    crate://crates.io/rustversion/1.0.14 \
    crate://crates.io/ryu/1.0.15 \
    crate://crates.io/same-file/1.0.6 \
    crate://crates.io/scopeguard/1.2.0 \
    crate://crates.io/serde-xml-rs/0.6.0 \
    crate://crates.io/serde/1.0.186 \
    crate://crates.io/serde_derive/1.0.186 \
    crate://crates.io/serde_json/1.0.105 \
    crate://crates.io/signal-hook-registry/1.4.1 \
    crate://crates.io/slab/0.4.9 \
    crate://crates.io/smallvec/1.11.0 \
    crate://crates.io/socket2/0.5.3 \
    crate://crates.io/static_assertions/1.1.0 \
    crate://crates.io/strum/0.25.0 \
    crate://crates.io/strum_macros/0.25.2 \
    crate://crates.io/syn/2.0.29 \
    crate://crates.io/termcolor/1.2.0 \
    crate://crates.io/thiserror-impl/1.0.47 \
    crate://crates.io/thiserror/1.0.47 \
    crate://crates.io/tokio-macros/2.1.0 \
    crate://crates.io/tokio-stream/0.1.14 \
    crate://crates.io/tokio-util/0.7.8 \
    crate://crates.io/tokio/1.32.0 \
    crate://crates.io/unicode-ident/1.0.11 \
    crate://crates.io/uuid/1.4.1 \
    crate://crates.io/walkdir/2.3.3 \
    crate://crates.io/wasi/0.11.0+wasi-snapshot-preview1 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-util/0.1.5 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/windows-sys/0.48.0 \
    crate://crates.io/windows-targets/0.48.5 \
    crate://crates.io/windows/0.48.0 \
    crate://crates.io/windows_aarch64_gnullvm/0.48.5 \
    crate://crates.io/windows_aarch64_msvc/0.48.5 \
    crate://crates.io/windows_i686_gnu/0.48.5 \
    crate://crates.io/windows_i686_msvc/0.48.5 \
    crate://crates.io/windows_x86_64_gnu/0.48.5 \
    crate://crates.io/windows_x86_64_gnullvm/0.48.5 \
    crate://crates.io/windows_x86_64_msvc/0.48.5 \
    crate://crates.io/xml-rs/0.8.16 \
"



# FIXME: update generateme with the real MD5 of the license file
LIC_FILES_CHKSUM = " \
    file://MIT;md5=generateme \
"

SUMMARY = "mecha-edge-bluetooth"
HOMEPAGE = "https://github.com/Dhruvesh08/mecha-edge-bluetooth.git"
LICENSE = "MIT"

# includes this file if it exists but does not fail
# this is useful for anything you may want to override from
# what cargo-bitbake generates.
include mecha-edge-bluetooth-${PV}.inc
include mecha-edge-bluetooth.inc
