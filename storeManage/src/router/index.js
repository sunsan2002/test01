import { createRouter, createWebHistory ,useRouter,useRoute} from 'vue-router'

const routes = [

]

const router = createRouter({
    history: createWebHistory(),
    routes
  })
  
//   router.beforeEach((to, from, next) => {
//     if (to.path == '/login') {
//       // 如果路径是 /login 则正常执行
//       next()
//     } else {
//       // 如果不是 /login，判断是否有 token
//       if (!localStorage.getItem('manager')) {
//         // 如果没有，则跳至登录页面
//         next({ path: '/login' })
//       } else {
//         // 否则继续执行
//         next()
//       }
//     }
//   })
  
  export default router