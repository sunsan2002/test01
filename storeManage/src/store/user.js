import {defineStore} from 'pinia'
import {ref} from "vue";


export default defineStore('first',{state:()=>{
    const token=''
    const name=''
    const sex=0
    const avatar='/src/assets/img/preAvatar.png'
    const birthday=null
    const username=''
},
getters:{
    // age(state){
    //     return new Date()-birthday.getYear()
    // }
},
action:{

}
})