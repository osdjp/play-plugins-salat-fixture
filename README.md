MongoDB Salat Fixture plugin for Play Framework 2
=================================================

See also
--------

 * https://github.com/leon/play-salat

Installation

Add dependency declarations into your `Build.scala` or `build.sbt` file:

    "jp.osd" %% "play-plugins-salat-fixture" % "0.1.0-SNAPSHOT"

We now need to register the plugin, this is done by creating(or appending) to the `conf/play.plugins` file

    500:se.radley.plugin.salat.SalatPlugin
    510:jp.osd.plugin.salat.SalatFixturePlugin
