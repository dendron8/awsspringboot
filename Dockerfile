FROM public.ecr.aws/amazoncorretto/amazoncorretto:21
ADD build/libs/TestSpringBoot-0.1.jar app.jar
EXPOSE 80
ENTRYPOINT exec java -jar app.jar