package(default_visibility = ["//visibility:public"])


java_library(
    name = "coffee_lib",
    srcs = glob(["**/*.java"]),
    deps = [
        "//common:dagger_with_annotation_processor",
        "//third_party/maven/javax/inject:javax_inject"
    ],
)

java_binary(
    name = "coffee",
    main_class = "coffee.CoffeeApp",
    runtime_deps = [":coffee_lib"],
    jvm_flags = [
        "-Xms32m",
        "-Xmx128m",
        ],
)

