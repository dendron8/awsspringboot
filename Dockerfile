FROM public.ecr.aws/amazoncorretto/amazoncorretto:17
ADD build/libs/TestSpringBoot-0.1.jar app.jar
ENTRYPOINT exec java -jar app.jar