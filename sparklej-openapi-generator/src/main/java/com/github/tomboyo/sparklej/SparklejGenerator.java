package com.github.tomboyo.sparklej;

import org.openapitools.codegen.*;
import org.openapitools.codegen.languages.JavaClientCodegen;

import java.nio.file.Paths;
import java.util.*;

public class SparklejGenerator extends JavaClientCodegen implements CodegenConfig {

  public SparklejGenerator() {
    templateDir = "libraries/sparklej";
    apiTemplateFiles.put("api.mustache", ".java");
    apiTemplateFiles.put("ApiClient.mustache", ".java");
  }

  @Override
  public String getName() {
    return "sparklej";
  }

  @Override
  public String getHelp() {
    return "Generates a java 11 native HTTP/S client library.";
  }
}
