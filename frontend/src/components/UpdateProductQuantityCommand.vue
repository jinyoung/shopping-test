<template>
    <v-card outlined>
        <v-card-title>
            UpdateProductQuantity
        </v-card-title>

        <v-card-text>
            <String label="ProductId" v-model="value.productId" :editMode="editMode"/>
            <Number label="Quantity" v-model="value.quantity" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="updateProductQuantity"
            >
                UpdateProductQuantity
            </v-btn>
            
            <v-btn
                    color="primary"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'UpdateProductQuantityCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.productId = '';
            this.value.quantity = 0;
        },
        watch: {
        },
        methods: {
            updateProductQuantity() {
                this.$emit('updateProductQuantity', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

