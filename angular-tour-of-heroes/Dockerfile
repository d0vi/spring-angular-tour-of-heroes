FROM node:10.15.3-jessie AS build

RUN npm install -g @angular/cli@7.3.8

COPY . /usr/src/app

WORKDIR /usr/src/app

RUN npm install && ng build --prod

FROM nginx:1.15.12-alpine

COPY --from=build /usr/src/app/dist/angular-tour-of-heroes /usr/share/nginx/html

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]
