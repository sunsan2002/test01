import { createApp } from 'vue'
import App from './App.vue'
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
import locale from 'element-plus/es/locale/lang/zh-cn'
import axios from 'axios'
import {createPinia} from 'pinia'
import router from './router/index'
import './style.css'
// import * as icons from '/src/element-plus/icons' 

const app = createApp(App)
app.use(router)
// app.use(ref())
// app.use(store)
// app.use(icons)
app.use(createPinia())
app.config.globalProperties.$http = axios

axios.defaults.baseURL = 'http://localhost:8080';//后端开发环境地址


app.use(ElementPlus,{locale}).mount('#app')
